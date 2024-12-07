def calcular_valor_futuro(valor_presente, taxa_juros, anos):
    return valor_presente * (1 + taxa_juros) ** anos

def calcular_valor_presente(valor_futuro, taxa_juros, anos):
    return valor_futuro / (1 + taxa_juros) ** anos

print("=== Calculadora Financeira ===")
print("Escolha uma operação:")
print("1. Calcular Valor Futuro")
print("2. Calcular Valor Presente")

opcao = int(input("Digite o número da operação escolhida: "))

if opcao == 1:
    print("\n=== Calcular Valor Futuro ===")
    valor_presente = float(input("Digite o valor presente (VP): "))
    taxa_juros = float(input("Digite a taxa de juros anual (em %): ")) / 100
    anos = int(input("Digite o número de anos: "))
    resultado = calcular_valor_futuro(valor_presente, taxa_juros, anos)
    print(f"O valor futuro é: R${resultado:.2f}")

elif opcao == 2:
    print("\n=== Calcular Valor Presente ===")
    valor_futuro = float(input("Digite o valor futuro (VF): "))
    taxa_juros = float(input("Digite a taxa de juros anual (em %): ")) / 100
    anos = int(input("Digite o número de anos: "))
    resultado = calcular_valor_presente(valor_futuro, taxa_juros, anos)
    print(f"O valor presente é: R${resultado:.2f}")

else:
    print("Opção inválida.")
