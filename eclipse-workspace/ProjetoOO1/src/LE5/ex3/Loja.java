package LE5.ex3;


/*3. Desenvolva um sistema para uma loja de produtos. Sabe-se que a loja é composta por um cnpj e uma
razão social (nome da loja). Além disso, a loja possui diversos produtos que são comercializados. Cada
produto é identificado por um código, nome do produto, marca, modelo, quantidade em estoque e valor
unitário que é vendido. Todos os detalhes da loja devem ser inicializados no momento da criação dela,
com exceção dos produtos, que poderão ser cadastrados em momentos oportunos.
Para este sistema, considere que a partir da loja será possível cadastrar novos produtos, adquirir um
produto já existente, exibir a lista de produtos cadastrados na loja e realizar a venda de produtos.
O cadastro de um novo produto pode ser realizado mediante o recebimento das informações do
produto, como código, nome do produto, marca, modelo, quantidade em estoque e valor unitário do
produto. Primeiramente deve-se verificar se este produto foi cadastrado anteriormente, caso tenha
sigo, então apenas o estoque é atualizado incrementando a quantidade existente em estoque a
quantidade de novos produtos adquiridos (que seriam cadastrados). Caso o produto não tenha sido
cadastrado anteriormente, então ele deve ser cadastrado normalmente.
Aloja pode ainda adquirir uma quantidade de produtos existentes em sua lista a fim de repor o estoque.
Neste caso, é necessário ter conhecimento do código do produto e a quantidade de produtos que serão
adquiridos. Se existir este produto na lista, então a quantidade de produtos em estoque é atualizado
com um incremento da quantidade atual a quantidade adquirida. Caso contrário, nada deve ser
realizado.
Deve ser possível imprimir um relatório com todos os produtos cadastrados na loja. O relatório deve
exibir todas as informações de todos os produtos. Obs.: não utilize o método toString( ) para realizar
a impressão dos dados de cada produto.
Por fim, pode-se realizar a venda de um produto que esteja no catálogo da loja. Para isto, é necessário
saber qual o código e a quantidade do produto que será vendido. Deve-se então encontrar o produto
solicitado e verificar a quantidade em estoque. A venda só será permitida se houver a quantidade
requerida em estoque. Após realizar a venda, o estoque deve ser atualizado decrementando a
quantidade vendida a quantidade existente.
Para realizar todos os testes necessários, utilize uma classe de testes.*/


public class Loja {

}
