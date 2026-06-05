package com.enem.smartunlock.data

object QuestionBank {
    val questions = listOf(
        // Física
        LocalQuestion(
            subject = "Física",
            text = "Energia hidrelétrica converte principalmente qual tipo de energia?",
            options = listOf("Energia térmica", "Energia potencial gravitacional", "Energia química", "Energia solar"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Física",
            text = "De acordo com a Lei de Ohm, qual é a relação entre tensão (V), corrente (I) e resistência (R)?",
            options = listOf("V = I × R", "V = I / R", "V = R / I", "V = I + R"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Física",
            text = "Uma onda sonora se propaga com velocidade de 340 m/s. Se a frequência é 100 Hz, qual é o comprimento de onda?",
            options = listOf("3.4 m", "34 m", "340 m", "0.34 m"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Física",
            text = "De acordo com a Segunda Lei de Newton, qual é a relação entre força, massa e aceleração?",
            options = listOf("F = m × a", "F = m / a", "F = a / m", "F = m + a"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Física",
            text = "Um objeto é lançado verticalmente para cima com velocidade inicial de 20 m/s. Qual é a altura máxima? (g = 10 m/s²)",
            options = listOf("10 m", "20 m", "30 m", "40 m"),
            correct = 1
        ),

        // História
        LocalQuestion(
            subject = "História",
            text = "A mecanização agrícola e o cercamento dos campos contribuíram para:",
            options = listOf("Êxodo rural", "Redução urbana", "Feudalismo", "Isolamento comercial"),
            correct = 0
        ),
        LocalQuestion(
            subject = "História",
            text = "Em qual ano ocorreu a Proclamação da República no Brasil?",
            options = listOf("1822", "1850", "1889", "1930"),
            correct = 2
        ),
        LocalQuestion(
            subject = "História",
            text = "Qual foi o principal objetivo da Revolução Francesa?",
            options = listOf("Expandir o império francês", "Derrotar Napoleão", "Abolir o sistema feudal e estabelecer direitos civis", "Conquistar novas colônias"),
            correct = 2
        ),
        LocalQuestion(
            subject = "História",
            text = "Qual foi o impacto da Revolução Industrial no século XVIII?",
            options = listOf("Redução do comércio internacional", "Transformação da produção artesanal em industrial", "Diminuição da população urbana", "Retorno ao feudalismo"),
            correct = 1
        ),
        LocalQuestion(
            subject = "História",
            text = "Em qual século ocorreu a Idade Média?",
            options = listOf("V a X", "V a XV", "X a XV", "XII a XVI"),
            correct = 1
        ),

        // Química
        LocalQuestion(
            subject = "Química",
            text = "O aumento do efeito estufa está ligado principalmente ao:",
            options = listOf("Oxigênio", "Nitrogênio", "Dióxido de carbono", "Argônio"),
            correct = 2
        ),
        LocalQuestion(
            subject = "Química",
            text = "Qual é o número de oxidação do carbono no dióxido de carbono (CO₂)?",
            options = listOf("+1", "+2", "+3", "+4"),
            correct = 3
        ),
        LocalQuestion(
            subject = "Química",
            text = "Em uma reação de combustão completa, qual é o produto principal além do dióxido de carbono?",
            options = listOf("Monóxido de carbono", "Água", "Oxigênio", "Nitrogênio"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Química",
            text = "O pH de uma solução é 3. Qual é a concentração de íons H⁺?",
            options = listOf("10⁻¹ mol/L", "10⁻² mol/L", "10⁻³ mol/L", "10⁻⁴ mol/L"),
            correct = 2
        ),
        LocalQuestion(
            subject = "Química",
            text = "Qual é o número atômico do oxigênio?",
            options = listOf("6", "7", "8", "9"),
            correct = 2
        ),

        // Biologia
        LocalQuestion(
            subject = "Biologia",
            text = "A fotossíntese é o processo através do qual as plantas convertem luz solar em energia química. Qual é o pigmento responsável pela absorção da luz?",
            options = listOf("Carotenóide", "Clorofila", "Xantofila", "Ficobilina"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Biologia",
            text = "Em relação ao ciclo de vida dos seres vivos, qual alternativa melhor descreve a meiose?",
            options = listOf("Divisão celular que mantém o número de cromossomos", "Divisão celular que reduz o número de cromossomos à metade", "Processo de síntese de proteínas", "Replicação do DNA sem divisão celular"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Biologia",
            text = "Qual das seguintes estruturas celulares é responsável pela produção de energia em forma de ATP?",
            options = listOf("Ribossomo", "Mitocôndria", "Retículo endoplasmático", "Aparelho de Golgi"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Biologia",
            text = "Qual é o papel do DNA na célula?",
            options = listOf("Armazenar energia", "Armazenar informações genéticas", "Produzir proteínas", "Regular a temperatura"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Biologia",
            text = "Qual é o maior rio do mundo em volume de água?",
            options = listOf("Rio Nilo", "Rio Amazonas", "Rio Iangtze", "Rio Mississípi"),
            correct = 1
        ),

        // Geografia
        LocalQuestion(
            subject = "Geografia",
            text = "Em qual continente está localizado o deserto do Saara?",
            options = listOf("Ásia", "América", "Europa", "África"),
            correct = 3
        ),
        LocalQuestion(
            subject = "Geografia",
            text = "Qual é a capital da Austrália?",
            options = listOf("Sydney", "Melbourne", "Brisbane", "Canberra"),
            correct = 3
        ),
        LocalQuestion(
            subject = "Geografia",
            text = "Qual é o país mais populoso do mundo?",
            options = listOf("Índia", "Estados Unidos", "Indonésia", "Brasil"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Geografia",
            text = "Qual é o maior oceano do mundo?",
            options = listOf("Oceano Atlântico", "Oceano Índico", "Oceano Pacífico", "Oceano Ártico"),
            correct = 2
        ),
        LocalQuestion(
            subject = "Geografia",
            text = "Qual é a montanha mais alta do mundo?",
            options = listOf("K2", "Monte Everest", "Kangchenjunga", "Lhotse"),
            correct = 1
        ),

        // Literatura
        LocalQuestion(
            subject = "Literatura",
            text = "Qual é o nome do romance de Machado de Assis publicado em 1899?",
            options = listOf("Dom Casmurro", "Quincas Borba", "Memórias Póstumas de Brás Cubas", "Esaú e Jacó"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Literatura",
            text = "Qual é o movimento literário ao qual pertence a obra 'Grandes Sertões: Veredas' de Guimarães Rosa?",
            options = listOf("Romantismo", "Realismo", "Modernismo", "Naturalismo"),
            correct = 2
        ),
        LocalQuestion(
            subject = "Literatura",
            text = "Em 'O Cortiço' de Aluísio Azevedo, qual é o tema central?",
            options = listOf("Amor entre personagens de classes diferentes", "Vida nas comunidades pobres e seus conflitos", "Aventuras de um marinheiro", "Mistério em um castelo"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Literatura",
            text = "Qual é o autor de 'Vidas Secas'?",
            options = listOf("Clarice Lispector", "Graciliano Ramos", "Jorge Amado", "Carlos Drummond de Andrade"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Literatura",
            text = "Qual é o gênero literário de 'O Alienista' de Machado de Assis?",
            options = listOf("Romance", "Novela", "Conto", "Poesia"),
            correct = 2
        ),

        // Matemática
        LocalQuestion(
            subject = "Matemática",
            text = "Qual é o resultado de 2³ + 3² - 5?",
            options = listOf("8", "10", "12", "14"),
            correct = 2
        ),
        LocalQuestion(
            subject = "Matemática",
            text = "Se x² - 5x + 6 = 0, quais são as raízes?",
            options = listOf("1 e 2", "2 e 3", "3 e 4", "1 e 6"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Matemática",
            text = "Qual é a área de um triângulo com base 10 cm e altura 8 cm?",
            options = listOf("40 cm²", "80 cm²", "160 cm²", "20 cm²"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Matemática",
            text = "Qual é o valor de π (pi) aproximadamente?",
            options = listOf("2.14", "3.14", "4.14", "5.14"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Matemática",
            text = "Qual é a solução para 2x + 5 = 15?",
            options = listOf("x = 5", "x = 10", "x = 15", "x = 20"),
            correct = 0
        ),

        // Mais questões variadas
        LocalQuestion(
            subject = "Física",
            text = "Qual é a velocidade da luz no vácuo?",
            options = listOf("300.000 km/s", "150.000 km/s", "450.000 km/s", "600.000 km/s"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Química",
            text = "Qual é o símbolo químico do ouro?",
            options = listOf("Au", "Ag", "Cu", "Pb"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Biologia",
            text = "Qual é o órgão responsável pela filtragem do sangue?",
            options = listOf("Coração", "Pulmão", "Rim", "Fígado"),
            correct = 2
        ),
        LocalQuestion(
            subject = "História",
            text = "Qual foi o primeiro presidente do Brasil?",
            options = listOf("Getúlio Vargas", "Deodoro da Fonseca", "Floriano Peixoto", "Prudente de Morais"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Geografia",
            text = "Qual é o rio mais longo do Brasil?",
            options = listOf("Rio Amazonas", "Rio São Francisco", "Rio Paraná", "Rio Tocantins"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Literatura",
            text = "Quem é o autor de 'O Corvo'?",
            options = listOf("Edgar Allan Poe", "Mark Twain", "Oscar Wilde", "Charles Dickens"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Matemática",
            text = "Qual é o perímetro de um quadrado com lado de 5 cm?",
            options = listOf("10 cm", "15 cm", "20 cm", "25 cm"),
            correct = 2
        ),
        LocalQuestion(
            subject = "Física",
            text = "Qual é a unidade de medida de força no Sistema Internacional?",
            options = listOf("Quilograma", "Newton", "Joule", "Watt"),
            correct = 1
        ),
        LocalQuestion(
            subject = "Química",
            text = "Qual é a fórmula da água?",
            options = listOf("H₂O", "CO₂", "O₂", "H₂"),
            correct = 0
        ),
        LocalQuestion(
            subject = "Biologia",
            text = "Qual é a função principal dos glóbulos vermelhos?",
            options = listOf("Combater infecções", "Transportar oxigênio", "Coagular o sangue", "Produzir energia"),
            correct = 1
        )
    )

    fun getRandomQuestions(count: Int): List<LocalQuestion> {
        return questions.shuffled().take(count)
    }
}

data class LocalQuestion(
    val subject: String,
    val text: String,
    val options: List<String>,
    val correct: Int
)
