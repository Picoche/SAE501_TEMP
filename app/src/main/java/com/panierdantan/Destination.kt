package com.panierdantan

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.panierdantan.custom_icons.FavorisIcon
import com.panierdantan.custom_icons.MapIcon
import com.panierdantan.custom_icons.ShopIcon
import com.panierdantan.custom_icons.ShoppingBag
import com.panierdantan.custom_icons.UserIcon


sealed class Destination(val destination: String, val label: String, val icon: ImageVector) {
    object VueBoutiques : Destination("vue_boutiques", "VueBoutiques", Icons.ShopIcon)
    object VuePanier : Destination("vue_panier", "VuePanier", Icons.ShoppingBag)
    object VueFavoris : Destination("vue_favoris", "VueFavoris", Icons.FavorisIcon)
    object VueProfil : Destination("vue_profil", "VueProfil", Icons.UserIcon)
    object Profil : Destination("profil", "Profil", Icons.Default.Home)
    object Carte : Destination("carte", "Carte", Icons.MapIcon)
    object CreationBoutique : Destination("creation_boutique", "CreationBoutique", Icons.Default.Search)
}
