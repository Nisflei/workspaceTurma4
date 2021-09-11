produtos = [
    {'produto': 'milho', 'preco': 59.90, 'peso_kg': 5500.0, 'trajeto': ['MT', 'SP']},
    {'produto': 'soja', 'preco': 19.55, 'peso_kg': 4300.0, 'trajeto': ['MS', 'SP']},
    {'produto': 'algodão', 'preco': 9.13, 'peso_kg': 3000.0, 'trajeto': ['GO', 'MT']},
    {'produto': 'milho', 'preco': 3.49, 'peso_kg': 8000.0, 'trajeto': ['MS', 'MT']},
    {'produto': 'milho', 'preco': 33.22, 'peso_kg': 5000.0, 'trajeto': ['MS', 'MT']},
    {'produto': 'adubo', 'preco': 67.79, 'peso_kg': 4500.0, 'trajeto': ['SP', 'MS']},
    {'produto': 'soja', 'preco': 45.31, 'peso_kg': 8000.0, 'trajeto': ['GO', 'SP']},
    {'produto': 'ração', 'preco': 93.27, 'peso_kg': 1500.0, 'trajeto': ['SP', 'MS']},
    {'produto': 'arroz', 'preco': 1.90, 'peso_kg': 5300.0, 'trajeto': ['RS', 'PR']},
]
#1 Colocar em ordem peso_kg

produtos.sort(key=lambda elemento: elemento['peso_kg'])
print(produtos)

#2 Vamos extrair somente os preços da lista
precos = list(map(lambda elemento: elemento['preco'], produtos))
print(precos)

#3 Devido ao combustivel, reajustar os valores em 10%

precos = list(map(lambda elemento: round(elemento['preco']* 1.10,2), produtos))
print(precos)

novo_produto = list(map(lambda elemento: {**elemento, 'preco': round(elemento['preco']* 1.10, 2)}, produtos))
print(novo_produto)
