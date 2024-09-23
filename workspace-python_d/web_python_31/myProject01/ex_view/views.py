from django.http import HttpResponse, HttpResponseRedirect #직접 응답할 때 사용
from django.shortcuts import render #템플릿을 사용할 때 사용

from django.utils import timezone
from django.urls import reverse
# Create your views here.

def index(request):
    now = timezone.now()
    print('현재 시간: ', now)
    print(reverse('ex_view:index')) # ' '
    print(reverse('ex_view:get1'))  # 'get1/'
    print(reverse('ex_view:get2', args=(11, 22, 'hello'))) # 'get2/?/?/?'
    return render(request, "ex_view/index.html", {'now':now}) # template 경로는 생략

def get1(request):
    print('get1/ 요청이 들어옴')
    #print(request.GET)
    keys = request.GET.keys()
    for key in keys:
        value = request.GET[key]
        print(f'{key}:{value}')
    return HttpResponse('get1')

def get2(request, n1, n2, n3):
    print('get2/ 요청이 들어옴')
    print('n1:', n1)
    print('n2:', n2)
    print('n3:', n3)
    return HttpResponse('get2')

def post1(request):
    print('post1/ 요청이 들어옴')
    keys = request.POST.keys()
    print( int(request.POST['n1']) + int(request.POST['n2']) )
    for key in keys:
        value = request.POST[key]
        print(f'{key}:{value}')
    return HttpResponse('post1')

def post2(request, msg, n): #문자열 데이터와 숫자 데이터 받기
    print('post2/ 요청이 들어옴')
    print('msg: ', msg)
    print('n: ', n)
    keys = request.POST.keys()
    print( int(request.POST['n1']) + int(request.POST['n2']) )
    for key in keys:
        value = request.POST[key]
        print(f'{key}:{value}')
    return HttpResponse('post2')

def get_post1(request):
    print(request.method)
    if request.method == 'GET':
        print('GET요청에 대한 처리') #사용자 입력 폼 처리(login)
    elif request.method == 'POST':
        print('POST 요청에 대한 처리') #입력 값 처리(login process)
    return HttpResponse('get_post1')

#클래스형 뷰
from django.views.generic import View #일반적인 뷰에 대한 처리를 장고에서 처리함

class MyGet3(View): #View 클래스 상속
    def get(self, request): #재정의 부분
        print('get3/ 클래스 요청이 들어옴')
        keys = request.GET.keys()
        for key in keys:
            value = request.GET[key]
            print(f'{key}:{value}')
        return HttpResponse('클래스 get3')
    
class MyGet4(View): #View 클래스 상속
    def get(self, request, n1, n2, n3):
        print('get4/ 클래스 요청이 들어옴')
        print('n1:', n1)
        print('n2:', n2)
        print('n3:', n3)
        return HttpResponse('클래스 get4')
    
class MyPost3(View):
    def post(self, request):
        print('post3/ 요청이 들어옴')
        keys = request.POST.keys()
        print( int(request.POST['n1']) + int(request.POST['n2']) )
        for key in keys:
            value = request.POST[key]
            print(f'{key}:{value}')
        return HttpResponse('클래스 post3')
    
class MyPost4(View):
    def post(self, request, msg, n): #문자열 데이터와 숫자 데이터 받기
        print('post4/ 요청이 들어옴')
        print('msg: ', msg)
        print('n: ', n)
        keys = request.POST.keys()
        print( int(request.POST['n1']) + int(request.POST['n2']) )
        for key in keys:
            value = request.POST[key]
            print(f'{key}:{value}')
        return HttpResponse('클래스 post4')
    
class MyGetPost(View):
    def get(self, request):
        print('클래스 GET 요청 동작')
        return HttpResponse('클래스 get_post2/(GET)')
    
    def post(self, request):
        print('클래스 POST 요청 동작')
        user = request.POST['user']
        pwd = request.POST['pwd']
        if user == pwd:
            print('로그인 성공')
            return HttpResponse('클래스 get_post2/(POST)')
        else:
            print('로그인 실패(다시 폼 전송)')
            return HttpResponseRedirect('/ex_view/')