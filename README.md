# Projeto: Configuração de Servidor na Nuvem com Terraform, Ansible e Pipeline Jenkins

Este projeto tem como objetivo configurar um servidor na nuvem utilizando a AWS, instalar e configurar componentes essenciais, e implementar uma infraestrutura como código com Terraform. Além disso, será criada uma pipeline de entrega contínua para a aplicação de monitorização.

Tecnologias Utilizadas
- Frameworks/Ferramentas:
    - Terraform
    - Ansible
    - Nginx
    - CI/CD Tools (Jenkins)

Instruções de Instalação e Uso
Pré-requisitos
- Conta na AWS
- Terraform instalado
- Ansible instalado

## Parte 1: Configuração do Servidor

- Utilizar o arquivo main.tf, para configurar as configurações para o grupo de segurança, rede e instância EC2.:
- Utilizando o Ansible ( arquivo: main-ansible-config.hd ) para instalar softwares necessários.

## Parte 2: Infraestrutura como Código

Provisionar/Configurar recursos:
- terraform init
- terraform apply main
- ansible-playbook -i hosts.ini deploy-nginx.yml

### Parte 3: Continuous Delivery
Criação do diagrama de fluxo para a pipeline, utilizando CI/CD Jenkins, por meio do arquivo ( pipilene.groovy ).
