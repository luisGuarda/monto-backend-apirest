# monto-backend-apirest

## PASO 1: crear imagen

docker build -t "bcp/monto-backend-apirest" .

## PASO 2: ejecutar contenedor
docker run --name monto-backend-docker -p 8080:8080 bcp/monto-backend-apirest:latest

## PASO 3 OPCIONAL: listar contenedores
docker container ls -a

### OPCIONAL: hacer un target de versionamiento de imagen
docker tag bcp/monto-backend-apirest bcp/monto-backend-apirest:1.0.0