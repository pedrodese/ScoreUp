# ScoreUp - Avaliador de Crédito e Recomendação de Cartões (Arquitetura de Microserviços)
Em andamento 🚀🚀🚀


## Tecnologias Utilizadas

- **Spring Boot**: Framework principal para construção dos microserviços.
- **Spring Cloud Eureka**: Serviço de descoberta para os microserviços, permitindo que eles se registrem e se encontrem dinamicamente.
- **Spring Cloud Gateway**: Gerenciamento de roteamento de requisições entre microserviços, atuando como ponto central de entrada.
- **Keycloak**: Solução de **Identity and Access Management (IAM)** usada para fornecer autenticação e autorização no **Spring Cloud Gateway**, protegendo as APIs com autenticação baseada em OAuth2 e OpenID Connect.
- **Spring Security**: Framework de segurança integrado no **Eureka Server** para proteger a comunicação entre os microserviços e garantir que apenas serviços autenticados possam interagir com o servidor de descoberta.
- **RabbitMQ**: Fila de mensagens para comunicação assíncrona entre os microserviços, permitindo o envio e recebimento de eventos de forma desacoplada.
- **PostgreSQL**: Banco de dados relacional utilizado para armazenar informações dos usuários e dados financeiros.
- **Docker**: Containerização dos microserviços e bancos de dados, garantindo que o ambiente de desenvolvimento e produção seja consistente e escalável.

