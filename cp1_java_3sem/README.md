# Checkpoint 1 - Programacao em Java, JPA e Annotations

## ✨ Integrantes do Grupo

- Otávio Miklos  - RM554513
- Raphaela Tatto - RM554983
- Tiago Capela   - RM558021
- Luciayla Kawakami  - RM557987


---

## 📄 Descrição do Projeto

Este projeto tem como objetivo demonstrar o uso de Java, JPA (Java Persistence API) e Annotations para criar um sistema de gerenciamento de funcionários. O sistema inclui:

- Classes para representar diferentes tipos de funcionários;
- Cálculo de salários com regras específicas;
- Geração de código SQL via Reflection;
- Persistência dos dados em banco de dados Oracle usando Hibernate.

---

## 🚀 Configuração do Projeto

### 1. Requisitos

- Java Development Kit (JDK) 11 ou superior
- Maven
- Banco de dados Oracle acessível
- IDE (IntelliJ IDEA, Eclipse, etc.)

### 2. Configuração do Banco de Dados

Atualize o arquivo `persistence.xml` com suas credenciais:

```xml
<property name="javax.persistence.jdbc.driver" value="oracle.jdbc.driver.OracleDriver"/>
<property name="javax.persistence.jdbc.url" value="jdbc:oracle:thin:@localhost:1521:xe"/>
<property name="javax.persistence.jdbc.user" value="[seu_usuario]"/>
<property name="javax.persistence.jdbc.password" value="[sua_senha]"/>
```

### 3. Dependências Maven

```xml
<dependencies>
    <!-- JPA -->
    <dependency>
        <groupId>jakarta.persistence</groupId>
        <artifactId>jakarta.persistence-api</artifactId>
        <version>3.1.0</version>
    </dependency>

    <!-- Hibernate Core -->
    <dependency>
        <groupId>org.hibernate</groupId>
        <artifactId>hibernate-core</artifactId>
        <version>6.4.4.Final</version>
    </dependency>

    <!-- Oracle JDBC Driver -->
    <dependency>
        <groupId>com.oracle.database.jdbc</groupId>
        <artifactId>ojdbc8</artifactId>
        <version>21.11.0.0</version>
    </dependency>
</dependencies>
```

### 4. Importação do Projeto

- Importe o projeto para sua IDE.
- Certifique-se de que as dependências do Maven estão resolvidas corretamente.

---

## 🔧 Explicação do Código

### 💼 Entidades (Employee e Subclasses)

- `Employee`: Classe base com atributos como nome, horas trabalhadas e valor por hora.
- `SeniorEmployee`: Adiciona bônus a cada 15h.
- `ManagerEmployee`: Acrescenta bônus fixo.
- `InternEmployee`: Aplica desconto de imposto no salário.

### 📃 Anotações Personalizadas

- `@Table` e `@Column`: Anotações criadas para simular mapeamento de entidades usando Reflection.

### 💡 DAO e JPA

- `IEmployeeDAO`: Interface com métodos CRUD.
- `EmployeeDAOImpl`: Implementação que usa `EntityManager` para persistir os dados.

### 📊 Arquivo de Configuração - `persistence.xml`

Contém a unidade de persistência `CHECKPOINT`, configuração do driver, credenciais e propriedades Hibernate.

### 💻 Classe Principal - `Main.java`

Sistema interativo via terminal para:

- Criar novo funcionário
- Listar todos
- Buscar por ID
- Atualizar dados
- Deletar registro
- Encerrar o programa

---

## ⚖️ Simulações

### Criar um funcionário
![Criar um funcionário](./img/1-Criar%20um%20funcionario.jpg)

### Buscar todos os funcionários
![Buscar todos os funcionários](./img/2-buscar%20todos%20os%20funcionarios.jpg)

### Buscar por ID
![Buscar por ID](./img/3-%20Buscar%20funcionario%20pelo%20ID.jpg)

### Atualizar funcionário
![Atualizar](./img/4-Atualiza%20o%20funcionario.jpg)

### Deletar
![Deletar](./img/5-%20Deleta%20um%20funcioanario.jpg)

### Encerrar programa
![Encerrar](./img/6-%20Fecha%20o%20programa.jpg)

### Classe de Teste executando CRUD automaticamente
![CRUD Test](./img/Classe%20teste%20fazendo%20CRUD.jpg)

### Cálculo de salários
![Cálculo Salários](./img/Cálculo%20dos%20salários.jpg)

---

## 🌟 Considerações Finais

Este projeto demonstra a utilização de:

- Java moderno com Orientação a Objetos
- JPA e Hibernate para persistência de dados
- Annotations e Reflection

🎉 Ótimo ponto de partida para sistemas mais robustos com Java!

