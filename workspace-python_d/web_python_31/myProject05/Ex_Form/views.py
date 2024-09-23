from django.http import HttpResponse
from django.shortcuts import render
from .forms import PersonForm
from .models import Person 
from .forms import PersonModelForm



# Create your views here.
def exam01(request):
    if request.method == 'POST':
        name = request.POST['name']
        age = request.POST['age']
        print('요청 처리: ', name, age)
        Person(name=name, age=age).save() #모델에 저장
        return HttpResponse('처리 완료')
    else:
        return render(request, 'Ex_Form/exam01_form.html')



def exam02(request):
    if request.method == 'POST':
        personForm = PersonForm(request.POST)
        if personForm.is_valid(): #유효성 검증
            name = personForm.cleaned_data['name'] #특수문자 같은 문자열 검증
            age = personForm.cleaned_data['age'] #나이가 200살, 1000살 같은 이상값 검증
            Person(name=name, age=age).save() #모델에 저장
            return HttpResponse('처리 완료')
        else:
            return render(request, 'Ex_Form/exam02_form.html', {'form':personForm})
    else:
        form = PersonForm()
        return render(request, 'Ex_Form/exam02_form.html', {'form': form})



def exam03(request):
    if request.method == 'POST':      
        form = PersonModelForm(request.POST)
        if form.is_valid():
            form.save()
            return HttpResponse('처리 완료')
    else: #GET인 경우
        form = PersonModelForm() #빈 폼을 만든다.
    
    return render(
        request, 
        'Ex_Form/exam03_form.html',
        {'form': form}
    )

def index(request):
    return render(request, 'Ex_Form/index.html')


from django.views.generic import View
from django.shortcuts import redirect, reverse

class MyView1(View):
    def get(self, request):
        form = PersonModelForm()
        return render(request, 'Ex_Form/exam04_form.html', {'form': form})
    def post(self, request):
        form = PersonModelForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect(reverse('Ex_Form:index'))
        
        return render ( #유효성 검증에 실패시
            request, 'Ex_Form/exam04_form.html', {'form': form} )
    
class MyView2(View):
    form_class = PersonModelForm
    initail = {
        'name' : '이름',
        'age' : 0
    }
    template_name = 'Ex_Form/exam04_form.html'

    def get(self, request):
        form = self.form_class(initial=self.initail)
        return render(request, self.template_name, {'form':form})
    
    def post(self, request):
        form = PersonModelForm(request.POST)
        if form.is_valid():
            form.save()
            return redirect(reverse('Ex_Form:index'))
        
        return render ( #유효성 검증에 실패시
            request, 'Ex_Form/exam04_form.html', {'form': form} )
    

from django.views.generic import FormView

class MyView3(FormView):
    form_class = PersonModelForm
    template_name = 'Ex_Form/exam04_form.html'
    success_url = '/ex/'    #성공하면 리다이렉트 할 경로

    def form_valid(self, form):
        print('데이터가 유효함')
        m = Person(**form.cleaned_data)
        m.save()

        return super().form_valid(form)
    

class MyView4(FormView):
    form_class = PersonModelForm
    template_name = 'Ex_Form/exam04_form.html'
    success_url = '/ex/'    #성공하면 리다이렉트 할 경로


from django.views.generic import DetailView

class MyView5(DetailView):
    model = Person


from django.views.generic import ListView

class MyView6(ListView):
    model = Person


from django.views.generic import UpdateView
class MyView7(UpdateView):
    model = Person
    form_class = PersonModelForm

    success_url = '/ex/exam09' #성공하면 리다이렉트 할 경로

    success_url = '/ex/exam08' #상세 정보로 리다이렉션 시킴

    #pk값을 가져와서 리다이렉트 경로에 추가
    def get_object(self): #메소드 재정의
        print('Update 처리')
        object = Person.objects.get(pk=self.kwargs['pk'])
        self.success_url += str(objec.id) + '/'
        return object
    


from django.views.generic import DeleteView

class MyView8(DeleteView):
    model = Person
    success_url = '/ex/exam09/' #삭제시키고 리다이렉션 시킴