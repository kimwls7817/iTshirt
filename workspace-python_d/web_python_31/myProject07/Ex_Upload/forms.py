from django import forms 
from .models import UploadFile

class UploadFileFrom(forms.ModelForm):
    class Meta:
        model = UploadFile
        fields = ['title', 'file']

    # 무조건 파일을 입력 받으려면 필요 없다.
    file = forms.FileField(required=False)