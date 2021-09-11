
# Como calcular um imposto de 30%
print("Exemplo1")
valor = 1000

def calculo_imposto(val):
    return val*0.30

print(calculo_imposto(valor))

calculo_imposto2 = lambda val: val * 0.30
print(calculo_imposto2(valor))

# Imposto diferente
def calculo_imp(val):
    return lambda x: x * val

spICMS = calculo_imp(0.18)
rjICMS = calculo_imp(0.10)

valorProduto = 1000
print(f"Imposto para SP : {spICMS(valorProduto)}  - produto: {valorProduto}")
print(f"Imposto para SP : {rjICMS(valorProduto)}  - produto: {valorProduto}")


print("Exemplo 2")
def funcOrder(elemento):
    return elemento[1]

lista=[
    ['Prod1', 100],
    ['Prod3', 700],
    ['Prod4', 300],
    ['Prod5', 200]
]

#lista.sort(key=funcOrder)
lista.sort(key=lambda elemento: elemento[1])
print(lista)

#Calcular um reajuste nos valores
print("Exemplo 3")
listaValores=[ 100,
               500,
               300,
               250]

novosValores = list(map(lambda x: x * 2, listaValores))
print(novosValores)

print("Exemplo Map")
animais = ["cao", "gato", "rato", "coelho"]

novo_animais = list(map(lambda item: str.upper(item), animais))
print(animais)
print(novo_animais)


lista=[
    ['Prod1', 100],
    ['Prod3', 700],
    ['Prod4', 300],
    ['Prod5', 200]
]

novo_lista = list(map(lambda elemento: str.upper(elemento[0]), lista))
print(novo_lista)

print("Exemplo Filter")
lista=[2, 3, 4, 5, 6, 7, 8]

nova_lista_filter = list(filter(lambda x: (x/3 == 2), lista))
print(nova_lista_filter)

listap=[
    ['Prod1', 100],
    ['Prod3', 700],
    ['Prod4', 300],
    ['Prod5', 200]
]
listaFilter = list(filter(lambda elemento: elemento[1] < 300, listap))
print(listaFilter)

from functools import reduce

lista=[2, 3, 4, 5, 6, 7, 8]

valorTotal = reduce(lambda acumulado, elemento: acumulado + elemento, lista)
print(valorTotal)