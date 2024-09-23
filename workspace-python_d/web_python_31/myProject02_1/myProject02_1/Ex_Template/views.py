from audioop import reverse
from django.shortcuts import render

# Create your views here.
def index(request):
    return render(request, "Ex_template/index.html")    #template

def ex01(request):
    n1 = 100
    lst = [1,2,3]
    tup = (4,5,6)
    dic = {'a':1, 'b':2, 'c':3}

    context = {
        'n1' : n1,
        'lst' : lst,
        'tup' : tup,
        'dic' : dic,
    }

    return render(request, "Ex_Template/ex01.html", context)

def ex02(requst):
    val1 = "hello<word><br>"
    lst = [ 'h0', 'Hi', 'welcom' ]
    tup = ( 1,2,3 )
    dic = { 'aa':10, 'bb':20, 'cc':30 }
    bio = 'hi1 hi2 hi3 hi4 hi5 hi6 hi7 hi8 hi9 hi10'
    ls = [ 100 ]
    lss = [ 200, 200 ]
    data = { 'val1':val1, 'lst':lst, 'tup':tup, 'dic':dic, 'bio':bio, 'ls':ls, 'lss':lss, }

    return render(requst, "Ex_Template/ex02.html", data)

class Info:
    def __init__(self, name, age): #객체 생성
        self.name = name
        self.age = age
    
    def __str__(self):
        return f'Info[name={self.name}, age={self.age}]'
    
def ex03(request):
    name_list = ['홍길동', '이순신', '임꺽정', '강감찬']
    info_list = [
        Info(name_list[0], 33),
        Info(name_list[1], 33),
        Info(name_list[2], 33),
        Info(name_list[3], 33),
    ]
    context = {
        'name_list' : name_list,
        'info_list' : info_list,
    }

    return render(request, "Ex_Template/ex03.html", context)

def ex04(request):
    name_list = ['홍길동', '이순신', '임꺽정', '강감찬']
    info_list = [
        Info(name_list[0], 33),
        Info(name_list[1], 34),
        Info(name_list[2], 23),
        Info(name_list[3], 87),
    ]
    context = {
        'value' : 100,
        'name_list' : name_list,
        'info_list' : info_list,
    }

    return render(request, "Ex_Template/ex04.html", context)

from django.urls import reverse

def ex05(request):
    url_list = [
        reverse('Ex_Template:index'),
        reverse('Ex_Template:ex01'),
        reverse('Ex_Template:ex02'),
        reverse('Ex_Template:ex03'),
        reverse('Ex_Template:ex04'),
        # reverse('Ex_Template:ex05path'),
        reverse('Ex_Template:ex05path', args=(10, 'KimYeJin')),
    ]

    return render(request, "Ex_Template/ex05.html", {'url_list': url_list, 'n':10, 'name':'KimYeJin'})