# Sgd - JWT

## Entendendo o funcionamento de TLS e JWT explique:

###### 1 Qual a diferença entre essas Tecnologias? 
- O TLS funciona em dois pares de chaves, chave privada e chave pública. Esse par de chaves garante que os dados possam ser criptografados por uma chave, mas só podem ser descriptografados pelo outro par de chaves.  E também oferece selo de segurança / selo que aumenta a segurança do seu site, bem como a confiança do visitante.
       
       O JSON Web Token (JWT) é um meio compacto e seguro de URL para representar declarações a serem transferidas entre duas partes. As JWTs representam um conjunto de declarações como um objeto JSON que é codificado em uma estrutura JWS e / ou JWE.
       
       O TLS e o JWT têm finalidades totalmente diferentes, portanto, o uso de TLS e JWT juntos depende do caso de uso. No entanto, para sites com autenticação de usuário, é recomendável usar o TLS básico, independentemente de você estar usando o JWT ou não. 
       
###### 2 Em que casos e possivel aplicar o TLS?
   - O principal uso está relacionado ao HTTP, para navegação na Web. Nestes casos, muitas dessas vezes apenas o servidor é autenticado. Não e recomendado usar o TLS, por exemplo, em muitos aplicativos em tempo real, pois eles não são baseados em TCP, mas em UDP.

###### 3 Exemplifique alguns casos de uso para JWT
- Quando se quer ter autenticidade pois pode ser usado para autorizar usuários e proteger rotas da API, em uma aplicação. Pois, no backend existe algumas rotas de API que precisam ser protegidas e alguns usuários precisam de autorização. Outra necessidade comum é gerar um token com alguns dados específicos. Podemos até validar esse formato de dados quando recebemos um token.          

###### 4 Quais outras tecnologias, em java, possuem objetivos similares?
     Spring Boot/Security / Java SE Security