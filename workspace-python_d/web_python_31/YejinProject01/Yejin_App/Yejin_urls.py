from django.urls import path
from . import views

app_name = 'Yejin_App'
urlpatterns = [
    path('', views.index),
    path('test1/', views.test1),
    path('test2/', views.test2),
]