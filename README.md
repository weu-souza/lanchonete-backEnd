# back end lanchonete

# service
## autentication
retorna os dados de login
## Category
possui o post, get, put e delete de lista de produtos, cria uma lista com um tipo de produto no front end
## product
possui o post, get, put e delete de produtos, o get faz a busca pelo nome da categoria, e retorna 
todos os dados pelo nome.
## offer 
possui o post, get, put e delete de produtos, get retorna todas as promoções no front end.
## chart
possui os metodos post, get, put e delete de carrinho, o metodo de post existem 2, um que faz o post de produtos
outro faz o post de promoções, existem 2 deletes também, um delete que deleta o carrinho pelo id do carrinho
e outro delete que apaga todo o carrinho pelo id de usuario.
## log 
a cada requisição e adicionado o nome de usuario, o tipo de requisição e a hora da requisição em uma tabela 
no back end para fazer auditoria isso não vai para o front end.
## salesBook 
e uma classe que não foi criada no front end, mas o intuito e que as compras ficassem guardadas em uma tabela
no front end para que o administrador do estabelecimento tivesse uma forma de ver o quanto recebeu apos o fim do expediente.
## token 
cria um token jwt contendo alguns dados de usuario exeto a senha, mais pra frente ao invez de retornar o token
no login, eu vou retornar atravez do um cookie.
## User
possui get, e post de usuario, e o metodo que faz o registro, existem 2 registros, o de usuario e o de adm, o de usuario
adiciona user na role e o de admin adiciona admin na role.
## configurations
e a configuração do spring securyt e do cors com o angular.
## filtertoken
verifica se o token esta valido, recebe o token pelo header do front end e verifica se ainda e valido.
