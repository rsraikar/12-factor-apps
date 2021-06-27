# 12-factor-app
Spring boot application using 12 factor Methodology:
1. Version Control - git
2. Dependency Management - maven
3. Configurations - separate config file to decouple code and config.
4. Backing service : A twelve-factor app should treat all  backing services such as database or message broker as attached resources.There shouldn't be requirement of  any code change to swap a compatible backing service. The only change should be in configurations.
5.Build,Release and Run:
        1.generate jar - use maven
        2.combine jar with right configurations : can use Packer with a provisioner like Ansible to create Docker images
        3.Run in a targeted exec. environment
        Jenkins does these steps manually.
6.Processes: stateless process.
7. Port Binding
8. 
