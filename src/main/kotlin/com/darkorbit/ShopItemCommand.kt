package com.darkorbit

interface ShopItemCommand : ProtocolPacket {
	var LevelDataList: MutableList<ShopItemLevelDataCommand>
	var amountsSelectable: String
	var buyMore: Boolean
	var canBeSubscribedTo: Boolean
	var category: String
	var cost: String
	var currency: String
	var discountPercent: String
	var elite: Int
	var expiresSeconds: Int
	var isActiveEventItem: Int
	var isPaymentItem: Int
	var isServerExclusive: Int
	var isSubscriptionPaused: Boolean
	var isSubscriptionRunning: Boolean
	var levelGrades: String
	var limitAmount: Int
	var limitMax: Int
	var limitType: LimitType
	var lootId: String
	var maxAmount: Int
	var maxlevel: Int
	var price: MutableList<Float>
	var saleRemainingTime: Long
	var secondsLeft: Long
	var userHasBoosterPackage: Boolean
}
