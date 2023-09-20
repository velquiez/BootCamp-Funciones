from django.http import HttpResponse

def saludo(request):
   return HttpResponse('Quiubo parcero!')

def despedida(request):
    return HttpResponse('Nos vemos...')