# API de Gerenciamento de Usuários

Uma API sistema simples de gerenciamento de usuários desenvolvido em **Java** com **Spring Boot** e **Maven**. Este projeto demonstra conceitos essenciais de APIs RESTful, boas práticas de desenvolvimento backend e organização de código, sendo ideal para estudos, testes e como ponto de partida para aplicações mais robustas.

---

## 🚀 Funcionalidades

- **Cadastrar usuário**: Adicione novos usuários ao sistema.
- **Listar usuários**: Consulte todos os usuários cadastrados.
- **Remover usuário**: Exclua usuários pelo ID.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Maven**
- **Jackson (serialização JSON)**
- **IntelliJ IDEA**
- **Git/GitHub**

---

## 📦 Estrutura do Projeto

```bash
  src/ 
  └── main/ 
    └── java/ 
      └── com/ 
        └── swetonydev/ 
          └── gerenciador_usuario/ 
          ├── controller/ 
          │ └── UsuarioController.java 
          └── model/
            └── Usuario.java
```

- **controller/**: Camada responsável pelas rotas e lógica de controle da API.
- **model/**: Representação dos dados (entidades).

---

## 🔥 Como Executar Localmente

1. **Clone o repositório:**

  ```bash
    git clone https://github.com/swetonyancelmo/gerenciador-de-usuarios.git cd gerenciador-de-usuarios
  ```

2. **Compile o projeto:**
   ```bash
   mvn clean install
   ```
   
3. **Execute a aplicação:**
  ```bash
  mvn spring-boot:run
  ```
4. **Acesse a API:**
   - Base URL: `http://localhost:8080`

---

## 📚 Exemplos de Uso

### 1. Listar Usuários

- **GET** `/users`
- **Resposta:**  
  ```json
  [
    {
      "id": 1,
      "nome": "João",
      "email": "joao@email.com"
    }
  ]
  ```
### 2. Cadastrar Usuário
- **POST** `/users`
- **Body:**
  ```json
  {
  "nome": "Maria",
  "email": "maria@email.com"
  }
  ```
- **Resposta:** `200 OK`

## 3. Remover Usuário
- **DELETE** `/users/{id}`
- **Exemplo:** `/users/1`
- **Resposta:** `200 OK` (ou `404 Not Found` se não existir)

<hr></hr>

## 👤 Autor

- [Swetony Ancelmo](https://github.com/swetonyancelmo)
- [Linkedin](https://www.linkedin.com/in/swetony-ancelmo)

## 📝 Licença

Este projeto está sob a licença MIT. Sinta-se livre para usar, modificar e contribuir!











  


