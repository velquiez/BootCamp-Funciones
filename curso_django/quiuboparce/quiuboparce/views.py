from django.http import HttpResponse

def saludo(request):
    return HttpResponse('Quiubo parce...')

def despedida(request):
    return HttpResponse('Chao bambino...')