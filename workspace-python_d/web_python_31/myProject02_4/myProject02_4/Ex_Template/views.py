from django.http import HttpResponse, HttpResponseRedirect
from django.shortcuts import render

# Create your views here.
def index(request):
    return render(request, "Ex_Template/index.html") # template 

def ex01(request):
    n1 = 100
    lst = [1,2,3]
    tup = (4,5,6)
    dic = {'a': 1, 'b': 2, 'c': 3}
    
    context = {
        'n1': n1,
        'lst': lst,
        'tup': tup,
        'dic': dic,
    }
    
    return render(request, "Ex_Template/ex01.html", context) # template 

def ex02(request):
    val1 = 'hello<world><br>'
    lst = [ 'h0', 'Hi', 'weLCome' ]
    tup = (1, 2, 3)
    dic = {'aa': 10, 'bb': 20, 'cc': 30}
    bio = 'hi1 hi2 hi3 hi4 hi5 hi6 hi7 hi8 hi9 hi10'
    ls = [100]    
    lss = [200, 200]
    data = { 'val1':val1, 'lst':lst, 'tup':tup, 
            'dic':dic, 'bio':bio, 'ls':ls, 'lss':lss, }
    return render(request, "Ex_Template/ex02.html", data)

class Info:
    def __init__(self, name, age): #객체 생성: Info('hong', 20)
        self.name = name
        self.age = age
        
    def __str__(self):
        return f'Info[name={self.name}, age={self.age}]'
    
def ex03(request):
    name_list = ['홍길동', '이순신', '임꺽정', '강감찬']
    info_list = [
        Info(name_list[0], 33),
        Info(name_list[1], 34),
        Info(name_list[2], 23),
        Info(name_list[3], 89),
    ]
    context = { 
        'name_list': name_list,
        'info_list': info_list,
    }
    return render(request, "Ex_Template/ex03.html", context)

def ex04(request):
    name_list = ['홍길동', '이순신', '임꺽정', '강감찬']
    info_list = [
        Info(name_list[0], 33),
        Info(name_list[1], 34),
        Info(name_list[2], 23),
        Info(name_list[3], 89),
    ]
    context = { 
        'value': 100,
        'name_list': name_list,
        'info_list': info_list,
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
        #reverse('Ex_Template:ex05path'),
        reverse('Ex_Template:ex05path', args=(10, 'hong')),
    ]
    return render(request, 
                "Ex_Template/ex05.html", 
                # {'url_list':url_list})
                {'url_list':url_list, 'n':10, 'name':'hong'})

def ex06(request):
    if request.method == 'GET':
        return render(request, "Ex_Template/ex06_login.html")
    elif request.method == 'POST':
        id = request.POST['id']
        pw = request.POST['pw']
        if id == pw:
            return HttpResponse('로그인 성공')
        else:
            return HttpResponseRedirect(reverse('Ex_Template:ex06'))

def ex07(request):
    value = 100
    info = Info('홍길동', 33)
    context = {
        'value': value,
        'info': info,
    }
    return render(request, "Ex_Template/ex07.html", context)

def ex08(request):
    html = '''<h3>Hello<h3> 홍길동'
    <script>
        alert('악의적인 동작');
    </script>
    '''
    context = {
        'html': html,
    }
    return render(request, "Ex_Template/ex08.html", context)