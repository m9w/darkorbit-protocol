package com.darkorbit

interface MenuItemStatusCommand : ProtocolPacket {
	var activatable: Boolean
	var available: Boolean
	var blocked: Boolean
	var buyable: Boolean
	var counterStyle: CounterStyle
	var counterValue: Long
	var iconLootId: String
	var maxCounterValue: Long
	var menuItemId: String
	var selected: Boolean
	var toolTipItemBar: MessageKeyListWildcardCommand
	var toolTipSlotBar: MessageKeyListWildcardCommand
	var visible: Boolean
}
