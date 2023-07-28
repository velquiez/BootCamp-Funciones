import logging  #Para generar ficheros de registro

logging.basicConfig(level=logging.INFO)

logging.info('Este mensaje es visto si se programa el reglon anterior')
logging.warning('Que mosquitos')
logging.error('corrijelo')
logging.critical('algo falla')

