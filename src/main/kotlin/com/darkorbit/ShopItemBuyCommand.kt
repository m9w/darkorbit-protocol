package com.darkorbit

interface ShopItemBuyCommand : ProtocolPacket {
	var action: String
	var allowAutoEquip: Int
	var buyCategory: String
	var canBeSubscribedTo: Boolean
	var canEquipItemId: MutableList<Long>
	var category: String
	var configId: Int
	var droneId: Long
	var emptySlotCount: Int
	var errorMessage: BaseStackCommand
	var hangarId: Long
	var hintEquipTo: String
	var isSubscriptionPaused: Boolean
	var isSubscriptionRunning: Boolean
	var lootId: String
	var realBuyAmount: Int
	var resultId: Int
	var secondsLeft: Long
	var slotSet: String
	var sucessMessage: BaseStackCommand
	var userHasBoosterPackage: Boolean
}
