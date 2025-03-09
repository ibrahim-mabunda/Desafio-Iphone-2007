# Simulador de iPhone em Java

Este projeto Java é um simulador de um iPhone com três aplicativos principais: **iPod**, **Phone** e **Internet**. O código principal está localizado no arquivo `Main.java`, que contém a lógica para interagir com esses aplicativos por meio de um menu de seleção.

---

## Estrutura do Código

### 1. **Classe Principal (`Main`)**

| Elemento         | Descrição                                                                                           |
|------------------|---------------------------------------------------------------------------------------------------|
| **`main`**       | Método principal do programa. Exibe um menu para o usuário escolher entre os aplicativos ou sair.   |
| **`ipod`**       | Gerencia a interação com o aplicativo iPod.                                                        |
| **`phone`**      | Gerencia a interação com o aplicativo Phone.                                                       |
| **`internet`**   | Gerencia a interação com o aplicativo Internet.                                                    |

---

### 2. **Aplicativo iPod**

| Função           | Descrição                                                                                           |
|------------------|---------------------------------------------------------------------------------------------------|
| **Seleção de música** | Permite ao usuário escolher uma música.                                                         |
| **Tocar/pausar** | Reproduz ou pausa a música selecionada. O loop continua até o usuário optar por sair.               |

---

### 3. **Aplicativo Phone**

| Função                  | Descrição                                                                                   |
|-------------------------|---------------------------------------------------------------------------------------------|
| **Fazer ligação**       | Permite realizar uma chamada telefônica.                                                    |
| **Atender chamada**     | Permite atender uma ligação recebida.                                                       |
| **Correio de voz**      | Oferece a opção de iniciar o correio de voz.                                                |
| **Loop contínuo**       | O programa continua em execução até que o usuário escolha sair.                             |

---

### 4. **Aplicativo Internet**

| Função                  | Descrição                                                                                   |
|-------------------------|---------------------------------------------------------------------------------------------|
| **Exibir página**       | Exibe uma página da web.                                                                    |
| **Adicionar aba**       | Permite abrir uma nova aba no navegador simulado.                                           |
| **Atualizar página**    | Atualiza a página exibida atualmente.                                                       |
| **Loop contínuo**       | O programa continua em execução até que o usuário escolha sair.                             |

---

## Exemplo de Uso

Quando o programa é executado, ele exibe o seguinte menu:

Escolha um app: 1: iPod 2: Phone 3: Internet 0: Sair

O usuário pode interagir com o menu e explorar as funcionalidades de cada aplicativo simulador.

