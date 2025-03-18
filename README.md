# Controle de Fluxo de Caixa de Supermercado

Este é um projeto desenvolvido em Java (Swing) para o controle de fluxo de caixa de um supermercado. A aplicação permite gerenciar entradas e saídas financeiras, gerar relatórios e exportar dados em formato PDF.

## Pré-requisitos

Antes de executar o projeto, verifique se os seguintes requisitos estão atendidos no seu ambiente:

### 1. MySQL Client
- Certifique-se de que o **MySQL Client** está instalado no seu computador.
- Configure um banco de dados MySQL local e ajuste as credenciais de conexão no código (produto e pedido).

### 2. Dependências
O projeto depende das seguintes bibliotecas externas. Elas devem ser adicionadas ao seu ambiente de desenvolvimento (como o classpath do projeto):

- **iTextPDF** (para geração de relatórios em PDF):
  - `itextpdf-5.0.6-sources (1).jar`
  - `itextpdf-5.0.6-javadoc (1).jar`
  - `itextpdf-5.0.6-bundle (1).jar`
  - `itextpdf-5.0.6 (1).jar`
- **EdisoncorSX** (para interface gráfica aprimorada):
  - `edisoncorSX (1).jar`

Você pode baixar essas bibliotecas manualmente e adicioná-las ao projeto ou configurá-las via uma ferramenta de gerenciamento de dependências, como Maven (se aplicável).

## Instalação

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/DevFilipeF/CONTROLE-DE-FLUXO-DE-CAIXA-DE-SUPERMERCADO.git
