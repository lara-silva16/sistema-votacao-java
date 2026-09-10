# Sistema de Votação em Java

Mini-projeto desenvolvido nas disciplinas de Lógica de Programação II e Programação Orientada a Objetos — Java.

## Objetivo
Cadastrar candidatos, registrar votos por turma e apresentar o resultado
da votação utilizando programação procedural, arrays e matrizes.

## Execução
```bash
javac SistemaVotacao.java
java SistemaVotacao
``
## 4. Plano de testes

| Teste | Entrada ou situação | Resultado observado |
|---|---|---|
| Quantidade inválida | Cadastrar 0 ou 6 candidatos | Mensagem de quantidade inválida e nova tentativa |
| Número repetido | Cadastrar dois candidatos com o mesmo número | Rejeitar o segundo número |
| Nome vazio | Pressionar Enter sem digitar o nome | Solicitar o nome novamente |
| Voto inexistente | Votar em um número não cadastrado | Ignorar o voto e continuar |
| Encerrar votação | Digitar 0 | Encerrar apenas a votação da turma |
| Entrada com letra | Digitar abc em uma opção numérica | Informar erro sem encerrar o programa |
| Limite da turma | Registrar 10 votos | Impedir o 11º voto |
| Empate | Dois ou mais candidatos com o maior total | Exibir todos os empatados |
| Sem votos | Abrir resultado antes da votação | Informar que não existem votos registrados |

    Markdows
    
## 5.1 Exemplo de teste de empate

Exemplo:

- Ana: 2 votos
- Bruno: 2 votos
- Carla: 1 voto

Resultado esperado:

Empate entre: Ana, Bruno

    Markdows
    
## 5.2 Conferência final antes da entrega

- O código compila sem erros.
- O menu continua funcionando após opções inválidas.
- O cadastro aceita no máximo cinco candidatos.
- Os números dos candidatos são únicos e maiores que zero.
- A votação rejeita candidatos inexistentes.
- Cada turma aceita no máximo dez votos.
- A matriz é exibida com loops aninhados.
- Os percentuais aparecem com duas casas decimais.
- O programa identifica vencedor único e empate.
- O repositório possui commits progressivos e foi enviado ao GitHub.

     Markdows
     
## 6. Entrega do projeto

- **Repositório GitHub:** link do projeto com o histórico de commits pelo Google Sala de Aula.
- **Arquivo principal:** SistemaVotacao.java.
- **Documentação:** README.md com objetivo, conceitos utilizados e comandos de execução.
- **Apresentação:** explicação oral do funcionamento de pelo menos um array, da matriz e de uma validação.

sistema-votacao-java/
├── .gitignore
├── README.md
└── SistemaVotacao.java

6.2 Comandos finais
javac SistemaVotacao.java
java SistemaVotacao

git status
git add .
git commit -m "docs: concluir documentação e testes do projeto"
git pushs
