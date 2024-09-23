from django.urls import path
from . import views

app_name = 'ex_view' # app_name 설정. 네임스페이스 역할

urlpatterns = [
    path('', views.index, name='index'),
    path('get111/', views.get1, name='get1'), # name 파라미터 입력. 뷰의 이름.
    path('get2/<int:n1>/<int:n2>/<str:n3>/', views.get2, name='get2'), 
    path('post1/', views.post1), 
    path('post2/<str:msg>/<int:n>/', views.post2), 
    path('get_post1/', views.get_post1), 
    
    # 클래스형 뷰 처리 => path('get1/', view.클래스.as_view()), 
    path('get3/', views.MyGet3.as_view()), 
    path('get4/<int:n1>/<int:n2>/<str:n3>/', views.MyGet4.as_view()), 
    path('post3/', views.MyPost3.as_view()), 
    path('post4/<str:msg>/<int:n>/', views.MyPost4.as_view()), 
    path('get_post2/', views.MyGetPost.as_view()), 
]