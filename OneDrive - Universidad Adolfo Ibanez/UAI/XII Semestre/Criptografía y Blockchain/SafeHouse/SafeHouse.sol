pragma solidity ^0.5.2;

contract SafeHouse{
	
	mapping(string=>bool) public registro;

	function registrar(string memory _registrar) public {
		registro[_registrar] = true;
	}

	function consultarRegistro(string memory _registrar) public view returns(boot _registrado) {
		return registro[_registrar];
	}
	
} 