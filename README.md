# Geolocalização no Cidade Social com ElasticSearch
Como projeto da displina de web3, temos a implementação da aplicação CidadeSocial com um Client do ElasticSearch para que a consulta a ele, feita por um cliente mobile em React-Native, seja feita por meio da aplicação CidadeSocial no servidor e não diretamente.

## Elastic - Postgres
Primeiramente, temos que configurar o *pipeline* para que o logstash conectar ao elastic ao postgres e preenche-lo e atualizar conforme este seja utilizado.

Para isso é necessário ter o logstash, que não está dockerizado, e precisa ser instalado por meio do [site oficial](https://www.elastic.co/guide/en/logstash/current/installing-logstash.html). As instruções também se encontram nele.

Após a instalação, é necessário alterar o arquivo .conf original, pelo alterado para acessar e requisitar dados do postgres. O arquivo alterado é o **logstash.conf**, dentro do arquivo **aux_files.zip**.

Há um arquivo docker-compose.yml para acelerar o início dos servidores postgres, pgAdmin e do elasticSearch, só sendo necessário para estes três um compose-up, no docker compose.

bash``` docker-compose up```

**PASSO DO QUE FOI FEITO NO BANCO AQUI**

## Spring Boot - Elastic

Para utilizar a aplicação Spring Boot, basta apenas que o elasticSearch esteja iniciado, e então subir a aplicação ao tomcat. 
Os arquivos de configuração necessários para o acesso ao elastic já está incluso.

## Postman - Spring Boot

A aplicação está funcional no client React-native, mas o start com o react-native para teste pode ser substituido por um teste no Postman, por questões de simplicidade. 

Também estará no arquivo zipado aux_files.zip, um arquivo com as consultas no Postman. Então basta apenas importar o arquivo e fazer os três testes: teste de busca por centróide, busca pelo retangulo da tela do celular, e teste de busca por palavra-chave.

Para importar basta seguir as instruções do [site oficial](https://learning.postman.com/docs/getting-started/importing-and-exporting-data/#importing-postman-data).