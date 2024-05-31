# Interpolação de variaveis

nome = "Rhuan"
idade = 20
linguagem = "Python"

# Old style %
print("Olá, me chamo %s. Eu tenho %d anos de idade, estou estudando a linguagem %s." % (nome, idade, linguagem))

# Method format
print("Olá, me chamo {}. Eu tenho {} anos de idade, estou estudando a linguagem {}.".format(nome, idade, linguagem))

# f-string
print(f"Olá, me chamo {nome}. Eu tenho {idade} anos de idade, estou estudando a linguagem {linguagem}.")

# f-string formatação
PI = 3.14159
print(f"Valor de PI: {PI:.2f}.")