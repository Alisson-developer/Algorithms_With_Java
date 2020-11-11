# Insertion Sort

## Explicação

* No metodo *insertionSort* da classe InsertionSort, para fazer a ordenação por inserção eu
usei um laço *for* para iterar no array de numeros.

* Criei uma variável *current* do tipo inteiro que vai armazenar o valor do indice
atual do array que terá sua posição alterada (ou não, caso o valor seja igual ou
maior ao seu predecessor);

* A variável *previousIndex* do tipo inteiro armazena o indice da posição anterior
ao indice atual(*current*);

* No loop *while* são feitas duas verificações. Se *previousIndex* é maior ou igual
a 0 e se o valor da lista na posição anterior é maior que o valor na posição atual(*current*).
Se ambas forem verdadeiras, o valor da posição anterior(*previousIndex*) + 1 vai receber o valor
da posição anterior(*previousIndex*), por fim o *previousIndex* será decrementado em 1 para
comparar com todas as posições anteriores.

* No final do *for*, a lista na posição anterior + 1 (*list[previousIndex] + 1*) vai receber
o valor atual armazenado na variável *current*.

## Problemas

* Eu obtive um problema ao printar a lista no console. Eu achava que eu tinha errado
em alguma parte do loop para a ordenação dos valores, no entanto após revisar o
codigo algumas vezes descobri que para exibir um array de Strings no Java é preciso
usar um metodo chamado *Array.asList()* e quando for de algum outro tipo, como inteiro
por exemplo, o metodo usado é o *Array.toString()*. Sem esses metodos, os arrays sempre
vão ser exibidos no console com um hashCode como: [I@e73f9ac.


# MergeSort

## Explicação

* No método *mergeSort()* eu usei a recursividade para repartir a lista ao
meio, até que seu tamanho seja igual a 1 e criando duas novas listas, a lista da 
esquerda leftList e a lista da direita rightList que receberão os valores da divisão
da lista de entrada.

Ex.: lista de entrada = [2,4,5,7,1,2,3,6], lista dividida = [2,4,5,7], [1,2,3,6] e
assim por diante.
Por fim, chamando método *merge()* que realizará a intercalação(merge) das lista
que foram repartidas.

* Separei o laço *for* e a criação das sub-listas em métodos diferentes com o 
objetivo de deixar o método *mergeSort()* o mais limpo possível.