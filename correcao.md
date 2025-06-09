# Correção

| Questão     | Legibilidade | Diagramas | P1 | P2 | P3 | Total |
|-------------|--------------|-----------|----|----|----|-------|
| Nota máxima | 10           | 10        | 20 | 25 | 35 | 100   |
| Nota        | 8            | 0         | 12 | 22 | 10 |       |

## Diagramas

sem diagramas

## P1

- a classe que gerencia os usuários deveria ter apenas membros estáticos
- Autenticar, Cadastrar, Listar, Remover são todos verbos
  - indicativo de que são métodos, não classes
  - não consigo imaginar o que seja um objeto do tipo 'AutenticarUsuario'
  - seguindo sua lógica, o número de classes explodiu, sendo que poderia ser apenas três
  - isso vale para todos os próximos pacotes também
- se a coleção de usuários não deve ter repetições, Lista não é uma boa escolha

### Requisitos Funcionais
- [x] Cadastrar novos usuários
- [x] Remover usuários
- [x] Listar os logins
- [x] Autenticar usuários

## P2

- SoC: classes variadas com print
- informação duplicada: Cliente tem telefone e é armazenado em um mapa de telefone -> cliente

### Requisitos Funcionais
- [x] Registrar novas solicitações
- [x] Listar os telefones dos clientes registrados
- [x] Imprimir o nome do próximo cliente
- [x] Atender o próximo cliente
- [x] Listar os nomes dos clientes já atendidos
- [x] Listar os telefones dos clientes em espera
- [x] Gerar um relatório estatístico
- [x] ... total de solicitações registradas, atendidas, em espera
- [x] ... distribuição percentual das solicitações por categoria

## P3

- Listas de todos os conjuntos
- quebra do encapsulamento: 'return livros' retorna a própria coleção, expondo ela pro mundo
- SoC: classes variadas com print
- cópias disponíveis é atribut oda biblioteca, não do livro
- Leitor.registrarEmprestimo é uma boa ideia, mas nunca é invocado!
  - Deverias verificar se o livro já foi emprestado durante o registrarEmprestimo()
  - Deverias verificar o tamanho desse set para garatir que ele é menor que 5 em registrarEmprestimo()
- Percorrer uma ArrayList e imprimir seus valores imprime-os na ordem de inserção

### Requisitos Funcionais
- [x] Cadastrar autores
- [x] Cadastrar livros
- [x] Cadastrar leitores
- [x] Registrar empréstimos de livros para leitores
- [x] ... pelo menos uma cópia
- [ ] ... leitor não tenha esse livro
- [ ] ... leitor possua no máximo 5 livros emprestados
- [ ] Listar autores em ordem alfabética
- [ ] Listar leitores em ordem alfabética
- [ ] Listar leitores por id
- [ ] Listar livros por título
- [ ] Listar livros por autor
- [ ] Listar livros por ISBN
- [ ] Listar empréstimos por data
- [ ] Listar empréstimos de um leitor, por data