from django.shortcuts import render

# Create your views here.
def index(request):
    print(request.COOKIES)
    print(request.session)
    print(request.session.session_key)
    request.session['now'] = '지금 무척 행복'
    # reponse = render(request, 'Ex_Cookie/index.html')

    # if not request.COOKIES.get('MyCookie'): #쿠키 정보가 없으면 설정한다.
    #     cookie_name = 'MyCookie'
    #     cookie_value = 'MyCookie Value'
    #     reponse.set_cookie(cookie_name, cookie_value) #시간이 설정되지 않은 세션 쿠키

    #     return reponse
    return render(request, 'Ex_Cookie/index.html', {'cookies': request.COOKIES})

from django.http import HttpResponse
from django.utils import timezone

def session_cookie(request):
    print('로그인 상태: ', request.session.get('login_user'))
    response = HttpResponse('세션 쿠키 생성')

    if not request.COOKIES.get('MyCookie'): # 쿠키 정보가 없으면 설정한다.
        cookie_name = 'MyCookie'
        cookie_value = timezone.now()
        response.set_cookie(cookie_name, cookie_value) #시간이 설정되지 않은 세션 쿠키
    return response


def permanent_cookie(request):
    print('로그인 상태: ', request.session.get('login_user'))
    response = HttpResponse('영구 쿠키 생성')

    if not request.COOKIES.get('MyCookie2'): #쿠키 정보가 없으면 설정한다.
        cookie_name = 'MyCookie2'
        cookie_value = timezone.now().day
        response.set_cookie( #영구 쿠키: max_age를 설정.
            cookie_name, 
            cookie_value, 
            max_age=60 #초단위로 1년인 경우 60*60*24*365와 같은 방식으로 설정
            )
    return response


def login(request):
    if request.method == 'GET':
        remember_id = request.COOKIES.get('id', '')
        return render(request, 'Ex_Cookie/login.html', {'remember_id':remember_id})
    else:
        id = request.POST['id']
        pw = request.POST['pw']

        remember = request.POST.get('remember', '')
        response = HttpResponse('로그인 성공!')

        if(id == pw):
            request.session['login_user'] = id
            if remember == '':
                response.delete_cookie('id')
            else: 
                response.set_cookie('id', id, max_age=60)
            return response
        else:
            return render(request, 'Ex_Cookie/login.html')
        

from django.shortcuts import redirect, reverse

def logout(request):
    request.session.flush()
    response = redirect(reverse('Ex_Cookie:index'))
    return response