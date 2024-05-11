class pessoa:
    def __init__(self, nome, sexo, ende, cpf, tel, iden):
        self.nome = nome
        self.sexo = sexo
        self.ende = ende
        self.cpf = cpf
        self.tel = tel
        self.iden = iden
    def mostrarDados(self):
        print('Nome: ' + self.nome)
        print('Sexo: ' + self.sexo)
        print('Endereço: ' + self.ende)
        print('CPF: ' + self.cpf)
        print('Telefone: ' + self.tel)
        print('Identidade: ' + self.iden)

class medico(pessoa):
    def __init__(self):
        print('Criar Médico')
        nome = str(input('Nome: '))
        sexo = str(input('Sexo: '))
        ende = str(input('Endereço: '))
        cpf = str(input('CPF: '))
        tel = str(input('Telefone: '))
        iden = str(input('Identidade: '))
        self.crm = str(input('CRM: '))
        self.especialidade = str(input('Especialidade: '))
        super(medico, self).__init__(nome, sexo, ende, cpf, tel, iden)
        input('\nMédico da clinica criado!\nPressione Enter para continuar')

class paciente(pessoa):
    def __init__(self, medicacaoContinua, *args):
        super(paciente, self).__init__(*args)
        self.medicacaoContinua = medicacaoContinua

class consultorio:
    def __init__(self):
        self.numero = 0
        self.medico = medico()
        self.pacientes = []
        self.consultas = []

    def mostrar(self):
        print('Médico: ')
        print('CPF: ' + self.medico.cpf + ' | ' + self.medico.nome + ' | ' + self.medico.sexo + ' | ' + self.medico.ende + ' | ' +
              self.medico.tel + ' | ' + self.medico.iden + ' | ' + self.medico.crm + ' | ' + self.medico.especialidade)
        print('Pacientes:')
        for p in self.pacientes:
            print('CPF: ' + p.cpf + ' | ' + p.nome + ' | ' + p.sexo + ' | ' + p.ende +
                  ' | ' + p.tel + ' | ' + p.iden + ' | ' + p.medicacaoContinua)
        print('Consultas:')
        for c in self.consultas:
            print('Número: ' + str(c.numero) + ' | ' + c.paciente.nome +
                  ' | ' + c.relato + ' | ' + c.medicamentos)
        input('\nPressione Enter para continuar')

    def cadastrarConsulta(self):
        print('Nova Consulta')
        n = 0
        cpf = input('Insira o cpf do Paciente: ')
        for p in self.pacientes:
            if p.cpf == cpf:
                n += 1
                paciente = p
        if n == 0:
            print('Paciente inexistente')
            input('\nPressione Enter para continuar')
            return
        relato = str(input('Insira o relato: '))
        medicamentos = str(input('Insira os medicamentos: '))
        c = consulta(paciente, relato, medicamentos, self.numero)
        self.numero += 1
        self.consultas.append(c)
        print('Consulta cadastrada')
        input('\nPressione Enter para continuar')

    def cancelarConsulta(self):
        numero = int(input('Insira o número da consulta a ser cancelada: '))
        index = -1
        for i in range(len(self.consultas)):
            if self.consultas[i].numero == numero:
                index = i
        if index != -1:
            self.consultas.pop(index)
            print('Consulta cancelada')
        else:
            print('Consulta inexistente')
        input('\nPressione Enter para continuar')

    def mostrarConsultasPaciente(self):
        print('Consultas do Paciente')
        cpf = input('Insira o CPF do Paciente: ')
        index = -1
        for i in range(len(self.pacientes)):
            if self.pacientes[i].cpf == cpf:
                index = i
        if index != -1:
            print('Consultas:')
            for c in self.consultas:
                if c.paciente.nome == self.pacientes[index].nome:
                    print('Número ' + str(c.numero) + ' | ' + c.paciente.nome + ' | ' +
                          c.relato + ' | ' + c.medicamentos)
        else:
            print('Paciente inexistente')
        input('\nPressione Enter para continuar')

    def mostrarTodasConsultas(self):
        print('Consultas:')
        for c in self.consultas:
            print('Número ' + str(c.numero) + ' | ' + c.paciente.nome +
                  ' | ' + c.relato + ' | ' + c.medicamentos)
        input('\nPressione Enter para continuar')

    def cadastrarPacientes(self):
        print('Novo Paciente')
        nome = str(input('Nome: '))
        sexo = str(input('Sexo: '))
        ende = str(input('Endereço: '))
        cpf = str(input('CPF: '))
        tel = str(input('Telefone: '))
        iden = str(input('Identidade: '))
        medicacaoContinua = str(input('Medicação Contínua: '))
        p = paciente(medicacaoContinua, nome, sexo, ende, cpf,
                     tel, iden)
        self.pacientes.append(p)
        input('\nPressione Enter para continuar')

    def removerPacientes(self):
        cpf = input('CPF do Paciente a ser removido: ')
        index = -1
        for i in range(len(self.pacientes)):
            if self.pacientes[i].cpf == cpf:
                index = i
        if index != -1:
            newConsultas = []
            for c in self.consultas:
                if c.paciente.cpf != self.pacientes[index].cpf:
                    newConsultas.append(c)
            self.consultas = newConsultas
            self.pacientes.pop(index)
            print('Paciente removido')
        else:
            print('Paciente inexistente')
        input('\nPressione Enter para continuar')


class consulta():
    def __init__(self, paciente, relato, medicamentos, numero):
        self.paciente = paciente
        self.relato = relato
        self.medicamentos = medicamentos
        self.numero = numero


c = consultorio()
print('\n*****************************\n')
while True:
    print('Escolha uma opção:\n')
    print('1 - Mostrar todos os dados')
    print('2 - Cadastrar consulta')
    print('3 - Cancelar consulta')
    print('4 - Mostrar consultas de um paciente')
    print('5 - Mostrar todas as consultas')
    print('6 - Cadastrar paciente')
    print('7 - Remover paciente')
    print('0 - Sair')
    opcao = int(input('\nEscolha: '))

    print('\n*****************************\n')

    if opcao == 1:
        c.mostrar()
    elif opcao == 2:
        c.cadastrarConsulta()
    elif opcao == 3:
        c.cancelarConsulta()
    elif opcao == 4:
        c.mostrarConsultasPaciente()
    elif opcao == 5:
        c.mostrarTodasConsultas()
    elif opcao == 6:
        c.cadastrarPacientes()
    elif opcao == 7:
        c.removerPacientes()
    else:
        break

    print('\n*****************************\n')
