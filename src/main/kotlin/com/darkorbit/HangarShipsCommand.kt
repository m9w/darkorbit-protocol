package com.darkorbit

interface HangarShipsCommand : ProtocolPacket {
	var allDesignPack: MutableList<ShipDesignPack>
	var drones: MutableList<HangarShipDroneView>
	var items: MutableList<InventoryItemPack>
	var petView: HangarShipPetView
	var ships: MutableList<HangarShipBriefCommand>
}
