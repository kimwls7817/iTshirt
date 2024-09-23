from django.urls import path
from . import views

app_name = 'Ex_Template' # app_name 설정. 네임스페이스 역할

urlpatterns = [
    path('', views.index, name='index'),
    path('ex01/', views.ex01, name='ex01'),
    path('ex02/', views.ex02, name='ex02'),
    path('ex03/', views.ex03, name='ex03'),
    path('ex04/', views.ex04, name='ex04'),
    path('ex05/', views.ex05, name='ex05'),
    path('ex06/', views.ex06, name='ex06'),
    path('ex07/', views.ex07, name='ex07'),
    path('ex08/', views.ex08, name='ex08'),
    
    path('ex05/<int:n>/<str:name>/', views.ex05, name='ex05path'),
]