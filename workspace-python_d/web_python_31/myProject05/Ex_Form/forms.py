from django import forms
from django.core.validators import MaxLengthValidator, MinLengthValidator
from .models import Person


#사용자가 직접 필드별로 값을 검증할 수 있는 메서드를 정의할 수 있음
#def clean_필드명
#파라미터 검증에 사용되는 메서드
def claen_age(self):
    age = self.cleaned_data.get('age', 0) #값이 없으면 0을 넣음
    if age > 150:
        raise forms.ValidationError('나이가 너무 많아요.')
    return age #반드시 값 반환
    
def age_validator(value):
    if value < 0:
        raise forms.ValidationError('나이는 음수를 사용할 수 없음')
    return value

def name_validator(value):
    if '!' in value:
        raise forms.ValidationError('이름에 !를 사용할 수 없음')
    return value



class PersonForm(forms.Form):
    name = forms.CharField(label='이름', 
                           max_length=20, 
                           required=True, 
                           validators=[MaxLengthValidator(limit_value=20), 
                                       MinLengthValidator(limit_value=2),
                                       name_validator])
    age = forms.IntegerField(label='나이', 
                             required=True,
                             validators=[age_validator])



class PersonModelForm(forms.ModelForm):
    class Meta:
        model = Person
        fields = ['name', 'age'] #Person이 가지고 있는 정보로 필드를 만듦

    def clean_name(self):
        print('name 유효성 검증')
        name = self.cleaned_data['name']
        if len(name) < 3:
            raise forms.ValidationError('문자열 길이가 오류입니다.')

    def clean_age(self):
        print('age 유효성 검증')
        age = self.cleaned_data.get('age')
        if age > 150:
            raise forms.ValidationError('나이가 너무 많아요!')
        return age
    
    def clean(self): #전체적으로 검증, 각 필드간의 연계성이 있는 경우
	    print('clear 호출')
	    return self.cleaned_data