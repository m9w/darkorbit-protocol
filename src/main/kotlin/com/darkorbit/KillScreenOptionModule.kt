package com.darkorbit

interface KillScreenOptionModule : ProtocolPacket {
	var affordableForPlayer: Boolean
	var buttonKey: MessageLocalizedWildcardCommand
	var cooldownTime: Int
	var descriptionKey: MessageLocalizedWildcardCommand
	var descriptionKeyAddon: MessageLocalizedWildcardCommand
	var price: PriceModule
	var repairType: KillScreenOptionTypeModule
	var toolTipKey: MessageLocalizedWildcardCommand
}
