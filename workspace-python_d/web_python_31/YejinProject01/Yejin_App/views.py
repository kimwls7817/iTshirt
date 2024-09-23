from django.utils import timezone
from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.

#<<기존>>
# def index(request):
#     print(''클라이언트로부터 요청을 받음'')
#     return HttpResponse('응답 데이터')

# <<template 폴더 생성 이후>>
def index(request):
    now = timezone.now()
    print('현재 시간: ', now)
    return render(request, "Yejin_View/index.html") #template 경로는 생략

def test1(request):
    return HttpResponse('김예진의 페이지 test1 응답입니다!')

def test2(request):
    return HttpResponse('김예진의 페이지 test2 응답입니다!')