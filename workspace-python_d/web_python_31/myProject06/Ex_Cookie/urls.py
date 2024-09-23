from django.urls import path
from . import views

app_name = 'Ex_Cookie'

urlpatterns = [
    path('', views.index, name='index'),
    path('session_cookie/', views.session_cookie, name='sc'),
    path('permanent_cookie/', views.permanent_cookie, name='pc'),
    path('ligin/', views.login, name='login'),
    path('logout/', views.logout, name='logout'),
]