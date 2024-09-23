from django.db import models

# Create your models here.
class Info(models.Model):
    name = models.CharField(max_length=20) #문자열 한 줄
    age = models.IntegerField(null=False) #정수 한 줄
    intro = models.TextField() #텍스트 여러 줄
    reg_date = models.DateTimeField(auto_now_add=True) #현재 시간 자동 추가

    def __str__(self):
        #Model을 상속 받았기 때문에 기본적으로 id를 가지고 있음
        return f'INso[id-{self.id}, name={self.name}, ...]'