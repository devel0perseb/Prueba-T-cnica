const tiposId = ["Cédula", "Pasaporte", "Cédula de Extranjería"];
const paises = {
  "Colombia": {
    "Cundinamarca": ["Bogotá"],
    "Antioquia": ["Medellín"],
    "Valle del Cauca": ["Cali"],
    "Risaralda": ["Pereira", "Dosquebradas"],
    "Santander": ["Bucaramanga"],
    "Norte de Santander": ["Cúcuta"],
    "Atlántico": ["Barranquilla"]
  },
  "Perú": {
    "Lima": ["Lima"],
    "La Libertad": ["Trujillo"],
    "Arequipa": ["Arequipa"]
  },
  "Costa Rica": {
    "San José": ["San José"],
    "Heredia": ["Heredia"],
    "Cartago": ["Cartago"],
    "Alajuela": ["Alajuela"]
  },
  "Panamá": {
    "Panamá": ["Ciudad de Panamá"]
  },
  "Venezuela": {
    "Distrito Capital": ["Caracas"],
    "Zulia": ["Maracaibo"],
    "Carabobo": ["Valencia"],
    "Lara": ["Barquisimeto"],
    "Monagas": ["Maturín"]
  }
};
const marcas = ["Americanino", "American Eagle", "Chevignon", "Esprit", "Naf Naf", "Rifle"];

function cargarSelect(id, opciones) {
  const select = document.getElementById(id);
  select.innerHTML = "";
  opciones.forEach(op => {
    const option = document.createElement("option");
    option.value = op;
    option.textContent = op;
    select.appendChild(option);
  });
}

document.addEventListener("DOMContentLoaded", () => {
  cargarSelect("tipoId", tiposId);
  cargarSelect("pais", Object.keys(paises));
  cargarSelect("marca", marcas);

  // cargar departamentos al cambiar de pais 
  document.getElementById("pais").addEventListener("change", e => {
    const departamentos = Object.keys(paises[e.target.value]);
    cargarSelect("departamento", departamentos);
    cargarSelect("ciudad", paises[e.target.value][departamentos[0]]);
  });

  //cargar ciudad al cambiar departamento 
  document.getElementById("departamento").addEventListener("change", e => {
    const paisSel = document.getElementById("pais").value;
    cargarSelect("ciudad", paises[paisSel][e.target.value]);
  });

  document.getElementById("registroForm").addEventListener("submit", e => {
    e.preventDefault();
    alert(" Cliente registrado con éxito (simulación.)");
  });
});

