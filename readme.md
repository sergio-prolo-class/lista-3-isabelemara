# Sistema de Login

## Descrição
Este projeto implementa um sistema simples de gerenciamento de usuários via terminal em Java. Ele permite cadastrar, remover, listar e autenticar usuários utilizando login e senha. O sistema é modularizado, com cada operação separada em classes específicas para melhor organização.

## Funcionalidades
- **Cadastrar Usuário**: Permite adicionar um novo usuário com login e senha.
- **Remover Usuário**: Remove um usuário existente pelo login.
- **Listar Usuários**: Exibe todos os usuários cadastrados (apenas o login).
- **Autenticar Usuário**: Verifica se o login e senha correspondem a um usuário cadastrado.
- **Menu Interativo**: Interface via terminal para escolher as operações.

## Como usar
1. Compile todos os arquivos `.java` no pacote `login`.
2. Execute a classe principal `App`.
3. No menu exibido, escolha as opções digitando o número correspondente:
    - `1` para cadastrar um usuário
    - `2` para remover
    - `3` para listar todos
    - `4` para autenticar
    - `0` para sair do sistema
4. Siga as instruções no terminal para inserir os dados.

## Estrutura do Projeto

**Pacote: login**
- `App.java`: Classe principal que inicia o programa e exibe o menu.
- `Menu.java`: Exibe o menu e chama as operações correspondentes.
- `SistemaLogin.java`: Armazena e gerencia a lista de usuários, implementando cadastro, remoção, listagem e autenticação.
- `Usuario.java`: Modelo simples que representa um usuário com login e senha.
- `CadastrarUsuario.java`: Realiza o cadastro de um novo usuário.
- `RemoverUsuario.java`: Remove um usuário pelo login.
- `ListarUsuarios.java`: Lista todos os usuários cadastrados.
- `AutenticarUsuario.java`: Realiza a autenticação do usuário.

## Regras do Sistema
- Login é único e **case-insensitive**.
- Autenticação exige que login e senha coincidam exatamente.
- Ao remover, o login deve existir; caso contrário, exibe erro.
- A listagem exibe apenas os logins dos usuários.

---

# Sistema de Atendimento

## Descrição
Este projeto implementa um sistema de atendimento ao cliente via terminal em Java. Ele permite registrar solicitações, listar clientes, acompanhar a fila de espera, atender clientes e gerar relatórios. O sistema é modularizado, com cada operação separada em classes específicas para melhor organização.

## Funcionalidades
- **Registrar Solicitação**: Adiciona uma nova solicitação com nome, telefone, descrição e categoria.
- **Listar Telefones de Clientes**: Mostra todos os telefones cadastrados no sistema.
- **Listar Telefones de Clientes em Espera**: Mostra apenas os telefones dos clientes aguardando atendimento.
- **Ver Próximo Cliente da Fila**: Exibe quem será o próximo a ser atendido.
- **Atender Cliente**: Remove o próximo da fila e registra como atendido.
- **Listar Clientes Atendidos**: Mostra os clientes que já foram atendidos.
- **Gerar Relatório**: Exibe estatísticas de atendimento por categoria.
- **Menu Interativo**: Interface via terminal para acesso a todas as opções.

## Como usar
1. Compile todos os arquivos `.java` no pacote `atendimento`.
2. Execute a classe principal `App`.
3. No menu exibido, escolha as opções digitando o número correspondente:
    - `1` para registrar solicitação
    - `2` para listar telefones de clientes
    - `3` para listar telefones em espera
    - `4` para ver o próximo da fila
    - `5` para atender o cliente da vez
    - `6` para listar clientes já atendidos
    - `7` para gerar relatório estatístico
    - `0` para sair
4. Siga as instruções no terminal para inserir os dados corretamente.

## Estrutura do Projeto

**Pacote: atendimento**
- `App.java`: Classe principal que inicia o programa.
- `Menu.java`: Exibe o menu e delega as operações.
- `Cliente.java`: Representa um cliente com nome e telefone.
- `Solicitacao.java`: Representa a solicitação feita pelo cliente, com categoria e descrição.
- `GerenciadorSolicitacoes.java`: Controla a fila de espera, os atendimentos e os dados do sistema.
- `RegistrarSolicitacao.java`: Realiza o registro de uma nova solicitação.
- `VerProximo.java`: Exibe o próximo cliente da fila.
- `AtenderProximoCliente.java`: Realiza o atendimento do próximo cliente da fila.
- `ListarClientesAtendidos.java`: Lista os clientes que já foram atendidos.
- `ListarTelefonesClientes.java`: Lista todos os telefones cadastrados.
- `ListarTelefonesEmEspera.java`: Lista os telefones dos clientes que estão aguardando atendimento.
- `GerarRelatorio.java`: Gera um relatório estatístico com a quantidade de atendimentos por categoria.

## Regras do Sistema
- **Fila de Atendimento**: Ordem de chegada (FIFO).
- **Identificação por Telefone**: Telefones são únicos.
- **Reaproveitamento de Cliente**: Mesmo telefone = mesmo cliente.
- **Categorias Permitidas**:
    - Suporte Técnico
    - Informação
    - Atendimento Financeiro
- **Relatório**: Mostra total e percentual por categoria.

---

# Sistema de Biblioteca

## Descrição
Este projeto implementa um sistema simples de gerenciamento de biblioteca em Java, com interface via terminal. Ele permite o cadastro de autores, leitores e livros, além do registro e listagem de empréstimos. O sistema controla a quantidade de cópias disponíveis por livro e limita os empréstimos por leitor.

## Funcionalidades
- **Cadastro de Autores**: Adiciona autores com nome e idioma nativo.
- **Cadastro de Leitores**: Adiciona leitores com nome e telefone.
- **Cadastro de Livros**: Adiciona livros com título, ISBN, autores e cópias.
- **Registro de Empréstimos**: Registra empréstimos, validando cópias e limites.
- **Listagens**: Lista autores, leitores, livros e empréstimos.
- **Controle de Empréstimos**:
    - Até 5 livros por leitor.
    - Sem repetir o mesmo livro.
    - Cópias atualizadas após empréstimo.

## Como usar
1. Compile todos os arquivos `.java` no pacote `biblioteca`.
2. Execute a classe principal `Menu`.
3. No menu, escolha as opções para cadastrar ou listar dados.
4. Use a opção de empréstimo para registrar novos empréstimos.
5. Para sair, escolha a opção `0`.

## Estrutura do Projeto

**Pacote: biblioteca**
- `SistemaBiblioteca.java`: Classe central que mantém as listas.
- `Menu.java`: Classe que apresenta o menu e gerencia a interação.
- `CadastroAutor.java`: Responsável pelo cadastro de autores.
- `CadastroLeitor.java`: Responsável pelo cadastro de leitores.
- `CadastroLivro.java`: Responsável pelo cadastro de livros.
- `RegistrarEmprestimo.java`: Controla o registro de empréstimos.
- `ListagemBiblioteca.java`: Lista autores, livros e leitores.
- `ListarAutores.java`: Lista autores ordenados alfabeticamente.
- `ListarEmprestimos.java`: Lista todos os empréstimos.
- `ListarEmprestimoDeLeitor.java`: Lista empréstimos de um leitor.
- `Autor.java`: Representa um autor com nome e idioma.
- `Leitor.java`: Representa um leitor com nome, telefone e livros emprestados.
- `Livro.java`: Representa um livro com título, ISBN, autores e cópias.
- `Emprestimo.java`: Representa um empréstimo feito por um leitor em uma data.

## Regras do Sistema
- Um livro só pode ser emprestado se houver cópias disponíveis.
- Um leitor pode ter até 5 livros ao mesmo tempo.
- Um leitor não pode repetir o mesmo livro.
- A quantidade de cópias é reduzida após empréstimo.
- Autores devem ser cadastrados antes de cadastrar livros.

## Exemplo de Uso
1. Cadastre autores.
2. Cadastre leitores.
3. Cadastre livros com autores.
4. Registre empréstimos.
5. Liste autores, leitores, livros e empréstimos para consulta.
