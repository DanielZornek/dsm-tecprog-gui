Exercício 1: Sistema de Formulário de Cadastro

Você foi contratado para criar um sistema de formulário de cadastro utilizando os componentes Swing. Crie uma classe chamada Cliente que deve receber o valor dos campos da classe CadastroForm que deve possuir:



Atributos:



JLabel para os títulos "Nome", "Idade" e "Sexo"

JTextField para inserir o nome

JSpinner para inserir a idade

Duas opções de JRadioButton para selecionar o sexo (masculino ou feminino)

JButton para enviar os dados



Funcionalidades:

Ao clicar no botão de enviar, os dados inseridos no formulário devem ser capturados e exibidos em um JLabel adicional na tela com o resumo das informações.



O sistema deve garantir que todos os campos sejam preenchidos antes de permitir a submissão.

Estruture seu código em classes e métodos apropriados utilizando conceitos de orientação a objetos.



Exercício 2: Ferramenta de Configuração de Preferências



Implemente uma ferramenta de configuração de preferências do usuário utilizando os componentes Swing. Crie uma classe chamada Usuário que salva as configurações e uma classe PreferenciasUsuario que deve conter:



Atributos:

JLabel para os títulos "Tema", "Notificações" e "Volume"

Um JComboBox com as opções "Claro" e "Escuro" para o tema

Um JCheckBox para habilitar/desabilitar notificações

Um JSlider para ajustar o volume (valores de 0 a 100)

JButton para salvar as preferências

JTextArea para exibir as preferências salvas



Funcionalidades:

O usuário deve selecionar o tema, habilitar ou desabilitar notificações, ajustar o volume e, ao clicar no botão "Salvar", as preferências selecionadas devem ser exibidas ao objeto usuário.

O sistema deve persistir as escolhas até que o programa seja fechado.

Utilize princípios de encapsulamento e organização modular do código, criando métodos separados para cada funcionalidade relevante.

Ao selecionar tema claro ou escuro a cor do JFrame deve ser modificada.
