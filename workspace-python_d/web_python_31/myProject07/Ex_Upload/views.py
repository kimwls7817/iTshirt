from django.shortcuts import render

# Create your views here.
def index(request):
    return render(request, 'Ex_Upload/index.html')

from .forms import UploadFileFrom
from django.shortcuts import redirect, reverse

def upload(request):
    if request.method == 'POST' :
        form = UploadFileFrom(request.POST, request.FILES)
        if form.is_valid(): #폼에 입력한 파일에 대한 검증
            form.save()
            return redirect(reverse('Ex_Upload:index'))
        else:
            form = UploadFileFrom()

        return render(request, 'Ex_Upload/upload_form.html', { 'form' : form })
    
from .models import UploadFile

def file_list(request):
    list = UploadFile.objects.all().order_by('-pk') #역정렬
    return render(
        request,
        'Ex_Upload/file_list.html',
        {'list': list}
    )

import os
from django.conf import settings

def file_delete(request, id):
    file = UploadFile.objects.get(pk=id)

    #실제 업로드된 파일도 삭제
    media_root = settings.MEDIA_ROOT
    remove_file = media_root + "/" + str(file.file)
    print('삭제할 파일:', remove_file)

    if os.path.isfile(remove_file):
        os.remove(remove_file) #실제 파일 삭제

    file.delete() #DB에서 샂제

    return redirect(reverse('Ex_Upload:list'))