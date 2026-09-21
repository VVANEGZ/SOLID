// Suscripciones club deportivo
type Plan = "basico" | "intermedio" | "pro"

class Cliente{
    constructor(
        public nombre: string,
        public email: string,
        public edad: number,
        public plan: Plan
    ) {}

    validarUsuario(): boolean{
        if(this.nombre.length < 2){
            console.log("nombre inválido");
            return false;
        } if(this.edad < 16){
            console.log("Debes ser mayor de 15");
            return false;
        } if (!this.email.includes('@')){
            console.log(`El correo ${this.email} no es un correo válido`);
        } return true;
    }

    guardarEnBD(): void{
        if(this.validarUsuario()){
        console.log(`Insertando ${this.nombre}`);
        console.log(`INSERT INTO clientes(nombre, email, edad, plan) VALUES ('${this.nombre}', '${this.edad}', '${this.email}','${this.plan}')`)    
        }
        
    }
    calcularPrecio(): number{
        const precios: Record<string, number> = {"basico": 299, "intermedio": 499, "pro": 999};
        const precio = precios [this.plan];
        return precio;
    }

    generarFactura(): string{
        const folio = `Britiana - ${Date.now()}`
        const total = this.calcularPrecio();
        const factura = `${folio} \n Cliente: ${this.nombre} | Plan: ${this.plan} | Total: ${total}`;
        return factura;
    }
    enviarCorreo(){
        console.log(`Bienvenido ${this.nombre} ha sido registrado con el plan ${this.plan}`);
        console.log(this.generarFactura());
    }

    registrarSuscripcion(): boolean{
        if(this.validarUsuario()){
            this.guardarEnBD()
            this.enviarCorreo()
            return true;
        } return false
    }
}

const angel = new Cliente('Angel Rojas', 'angel@gmail.com', 35, 'intermedio');

angel.registrarSuscripcion()