# Exercício: Abastecimento automotivo

Um aplicativo de pagamentos de combustível precisa registrar os abastecimentos efetuados pelos usuários. Um abastecimento é composto pelo código do posto de gasolina (letras e números), o código da bomba (apenas números), o tipo de combustível (álcool, gasolina comum, gasolina aditivada ou diesel), a quantidade que foi abastecida (em litros), o preço por litro no momento do abastecimento, e o desconto caso houver (em porcentagem). 

Projete uma classe que represente um abastecimento, aplicando os princípios de ocultamento da informação, de modo que todas as propriedades possam ser consultadas, mas não podem ser alteradas após a construção do objeto. 

Todas as propriedades do abastecimento são obrigatórias, exceto o desconto (o qual, na ausência de valores explícitos, deve ser nulo). Não é permitido incluir abastecimentos de um tipo de combustível não-previsto na listagem acima. Nenhum valor numérico deve ser nulo, e nenhum código deve ser vazio (i.e. é preciso have pelo menos um caractere), além do que os códigos precisam respeitar as regras de formação definidas no parágrafo anterior. 

A API da classe deve prover métodos para: i) consultar o custo bruto do abastecimento (sem desconto); ii) consultar o custo líquido do abastecimento (com desconto). 

Defina um programa-cliente que crie instâncias do objeto e teste se as especificações do objeto foram corretamente implementadas.
