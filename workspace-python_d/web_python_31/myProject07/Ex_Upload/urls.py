from django.urls import path
from . import views

app_name = 'Ex_Upload'

urlpatterns = [
    path('', views.index, name='index'),
    path('upload/', views.upload, name='upload'),
    path('list/', views.file_list, name='list'),
    path('remove/<int:id>/', views.file_delete, name='remove'),
]