# Projeto YouTube - Programação Orientada a Objetos em Java

👨🏾‍💻 Este repositório apresenta o projeto **YouTube POO**, desenvolvido como parte da conclusão do curso de **Java POO** do [Curso em Vídeo](https://www.cursoemvideo.com/curso/java-poo/), ministrado pelo professor **Gustavo Guanabara**.

O projeto simula uma plataforma de vídeos e foi desenvolvido aplicando os quatro pilares da **Programação Orientada a Objetos (POO)**:  
🔹 **Encapsulamento**  
🔹 **Herança**  
🔹 **Polimorfismo**  
🔹 **Abstração**

## ✨ O que foi desenvolvido

Criei um sistema com interação entre usuários (gafanhotos), vídeos e visualizações, com validações e melhorias além das mostradas em aula, como:

- Validação de avaliações com limites entre 0 e 10
- Controle do estado de reprodução do vídeo
- Atualização automática de views e vídeos assistidos ao instanciar uma visualização
- Cálculo de avaliação baseado em média ponderada
- `toString()` personalizados com `StringBuilder` para exibição mais clara de dados

## 📂 Principais Classes

| Classe            | Descrição                                                                 |
|-------------------|---------------------------------------------------------------------------|
| `Pessoa`          | Classe abstrata base com atributos comuns (nome, idade, sexo, experiência)|
| `Gafanhoto`       | Representa o usuário da plataforma. Herda de Pessoa                       |
| `Video`           | Classe que representa um vídeo com título, avaliação, curtidas, etc.     |
| `Visualizacao`    | Faz a ligação entre `Gafanhoto` e `Video`. Permite avaliar e registrar views |
| `AcoesVideo`      | Interface que define métodos `play`, `pause` e `like`                    |
| `ProjetoYoutube`  | Classe `main` com testes das interações entre os objetos criados         |

## 🧠 Conceitos Utilizados

- Abstração com classe `Pessoa`
- Herança em `Gafanhoto`
- Polimorfismo com métodos de avaliação sobrecarregados
- Encapsulamento com uso de `private`, `getters` e `setters`
- Validações e mensagens de feedback em métodos
- Interface funcional `AcoesVideo`

## 📊 Diagrama de Classes (UML)

<img src="https://i.imgur.com/udwJQmk.png" alt="UML Projeto YouTube" width="500"/>

## 💻 Execução

1. Clone o repositório:
   ```bash
   git clone https://github.com/hebertesteves/projeto-youtube-poo.git
   ```
2. Abra em sua IDE Java (IntelliJ, Eclipse ou NetBeans).
3. Execute a classe `ProjetoYoutube.java`.

## 📜 Certificação

Curso concluído: **Java POO - Curso em Vídeo**  
📄 Carga horária: 40h  
👨🏾‍🏫 Professor: Gustavo Guanabara  
🔗 [Visualizar certificado](https://drive.google.com/file/d/1ht_fiBFglUUXziaEtp_aAz60MaPLZB5v/view)
