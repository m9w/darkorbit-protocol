package com.darkorbit

interface RogueLiteShipModule : ProtocolPacket {
	var drones: MutableList<RogueLiteDroneModule>
	var equipments: MutableList<InventoryItemModule>
	var hp: Int
	var loadOutId: String
	var lootId: String
	var petEquipments: MutableList<InventoryItemModule>
	var shield: Int
	var shipId: Int
	var speed: Int
	var spread: Int
}
