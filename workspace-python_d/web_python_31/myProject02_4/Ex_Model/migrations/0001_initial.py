# Generated by Django 4.2.6 on 2024-05-10 01:49

from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Info',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('name', models.CharField(max_length=20)),
                ('age', models.IntegerField()),
                ('intro', models.IntegerField()),
                ('reg_date', models.DateTimeField(auto_now_add=True)),
            ],
        ),
    ]
