from django.http import HttpResponse
from django.shortcuts import render
from django.utils import timezone

def index(request):
    now = timezone.now()
    context = {
        'now' : now,
        'name' : '김예진',
    }
    
    return render(request, 'index.html', context) 